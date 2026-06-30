package ot0;

/* loaded from: classes8.dex */
public class l1 extends ot0.n0 {
    public l1() {
        this.f348606q = new ot0.s0();
    }

    public void b(android.os.Bundle bundle) {
        try {
            if (((km0.c) gm0.j1.p().a()).a()) {
                int i17 = this.f348606q.f348770o;
                if (i17 == 5 || i17 == 8) {
                    java.util.LinkedList linkedList = this.f348607r;
                    if (linkedList.size() == 0) {
                        linkedList.add(tv.a.b(qk.c.b(this.f348606q.f348766i, 4, true)));
                    }
                }
            }
            bundle.putByteArray("biz_mp_msg_info", toByteArray());
            bundle.putString("rawUrl", this.f348606q.f348762e);
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MPMsgInfo", "writeToIntent %s", e17.getMessage());
        }
    }
}
