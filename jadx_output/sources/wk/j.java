package wk;

/* loaded from: classes12.dex */
public class j extends com.tencent.mm.sdk.event.n {

    /* renamed from: d, reason: collision with root package name */
    public tl.p0 f446879d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f446880e;

    public j() {
        super(0);
        this.f446880e = "";
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        tl.p0 p0Var;
        com.tencent.mm.autogen.events.ExtRecordEvent extRecordEvent = (com.tencent.mm.autogen.events.ExtRecordEvent) iEvent;
        am.o8 o8Var = extRecordEvent.f54206g;
        int i17 = o8Var.f7516a;
        am.p8 p8Var = extRecordEvent.f54207h;
        if (i17 == 1) {
            if (this.f446879d == null) {
                this.f446879d = new tl.p0(com.tencent.mm.sdk.platformtools.x2.f193071a, false);
            }
            p8Var.f7608a = this.f446879d.g(o8Var.f7517b, null);
            this.f446880e = this.f446879d.a();
        } else if (i17 == 2 && (p0Var = this.f446879d) != null) {
            p8Var.f7609b = this.f446880e;
            p8Var.f7608a = p0Var.stop();
            int i18 = o8Var.f7516a;
            this.f446880e = "";
        }
        return true;
    }
}
