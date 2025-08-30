package andre4j.tickets_flow_spring_microservice_worker_1.domain.model;

public class FreestarModel extends TicketModel {

  private Boolean isIMax;

  public FreestarModel() {
    super();
  }

  public Boolean getIsIMax() {
    return isIMax;
  }

  public void setIsIMax(Boolean isIMax) {
    this.isIMax = isIMax;
  }

  @Override
  public String toString() {
    return "FreestarModel [" + super.toString() + ", isIMax=" + isIMax + "]";
  }
}
