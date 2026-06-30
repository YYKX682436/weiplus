package zo1;

/* loaded from: classes5.dex */
public final /* synthetic */ class c4 extends kotlin.jvm.internal.m implements yz5.l {
    public c4(java.lang.Object obj) {
        super(1, obj, zo1.k4.class, "notifyTaskChanged", "notifyTaskChanged(J)V", 0);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        long longValue = ((java.lang.Number) obj).longValue();
        zo1.k4 k4Var = (zo1.k4) this.receiver;
        java.util.Iterator it = k4Var.f474674e.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            }
            if (((com.tencent.wechat.aff.affroam.g) it.next()).f215829d == longValue) {
                break;
            }
            i17++;
        }
        if (i17 >= 0) {
            k4Var.notifyItemChanged(i17);
        }
        return jz5.f0.f302826a;
    }
}
