package hz4;

/* loaded from: classes12.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.NotifyWNNoteOperationEvent f286440d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hz4.p f286441e;

    public n(hz4.p pVar, com.tencent.mm.autogen.events.NotifyWNNoteOperationEvent notifyWNNoteOperationEvent) {
        this.f286441e = pVar;
        this.f286440d = notifyWNNoteOperationEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        hz4.p.r(this.f286441e, this.f286440d.f54554g.field_favProto, true, 5);
    }

    public java.lang.String toString() {
        return super.toString() + "|dealWNoteInfo";
    }
}
