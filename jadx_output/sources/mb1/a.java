package mb1;

/* loaded from: classes7.dex */
public class a extends ob1.c {
    @Override // ob1.c
    public void l() {
        if (this.f343986a.f317717e == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Ble.Action", "connection is not open.", new java.lang.Object[0]);
            p(ob1.m.f344025l);
            m();
        } else {
            this.f343986a.k(true);
            p(ob1.m.f344018e);
            m();
        }
    }

    @Override // ob1.c
    public java.lang.String n() {
        return "CloseAction";
    }
}
