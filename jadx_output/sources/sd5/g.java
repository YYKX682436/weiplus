package sd5;

/* loaded from: classes9.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sd5.h f406711d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f406712e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(sd5.h hVar, java.util.List list) {
        super(0);
        this.f406711d = hVar;
        this.f406712e = list;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sd5.h hVar = this.f406711d;
        int ordinal = hVar.f406715c.ordinal();
        qd5.d dVar = qd5.d.f361905a;
        sd5.o oVar = hVar.f406714b;
        java.util.List list = this.f406712e;
        if (ordinal != 0) {
            if (ordinal != 1) {
                java.lang.String str = hVar.f406718f;
                if (ordinal == 2) {
                    int max = java.lang.Math.max(0, ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().F2(hVar.f406718f, oVar.e(), ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().p5(str)) - 1);
                    boolean z17 = max <= 48;
                    com.tencent.mars.xlog.Log.i("MicroMsg.ChattingSearchDataPresenterV2", "ACTION_UPDATE bottomIncCount:%d, shouldLoadBottom:%b", java.lang.Integer.valueOf(max), java.lang.Boolean.valueOf(z17));
                    if (z17) {
                        list.addAll(oVar.l());
                    } else {
                        list.addAll(oVar.m());
                    }
                } else if (ordinal == 3 || ordinal == 4) {
                    android.os.Bundle bundle = hVar.f406716d;
                    if (bundle == null) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.ChattingSearchDataPresenterV2", "null == sourceArgs!");
                    } else {
                        long j17 = bundle.getLong("MSG_ID");
                        java.lang.String string = bundle.getString("MSG_TALKER");
                        java.util.List i17 = hVar.f406714b.i(string == null || string.length() == 0 ? str : string, j17, bundle.getBoolean("IS_LOAD_ALL", false), false);
                        java.util.Iterator it = i17.iterator();
                        int i18 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i18 = -1;
                                break;
                            }
                            if (((com.tencent.mm.storage.f9) it.next()).getMsgId() == j17) {
                                break;
                            }
                            i18++;
                        }
                        hd5.q qVar = hVar.f406717e;
                        if (qVar != null) {
                            qVar.f280636h = j17;
                        }
                        int m17 = hVar.f406713a.m();
                        if (qVar != null) {
                            if (i18 >= 0) {
                                m17 += i18;
                            }
                            qVar.f280635g = m17;
                        }
                        list.addAll(i17);
                        list.clear();
                        dVar.b(oVar);
                        dVar.c(oVar);
                        list.addAll(oVar.f406723d);
                    }
                } else if (ordinal == 7) {
                    if (oVar.f()) {
                        list.addAll(oVar.f406723d);
                    } else {
                        list.addAll(dVar.d(oVar));
                    }
                }
            } else {
                list.addAll(oVar.j());
            }
        } else {
            list.addAll(dVar.e(oVar));
        }
        return jz5.f0.f302826a;
    }
}
