package pd0;

/* loaded from: classes11.dex */
public class v1 extends com.tencent.mm.sdk.event.n {
    public v1() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        wo.w0.c();
        if (fo3.s.INSTANCE.He()) {
            return false;
        }
        od0.r.wi();
        return false;
    }
}
