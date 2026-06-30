package rr;

/* loaded from: classes12.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rr.n f399133d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f399134e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(rr.n nVar, boolean z17) {
        super(0);
        this.f399133d = nVar;
        this.f399134e = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17;
        rr.n nVar = this.f399133d;
        nVar.getClass();
        if (this.f399134e) {
            com.tencent.mars.xlog.Log.i(nVar.f399138d, "dealSaveSuccess");
            com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = nVar.f399137c;
            int i17 = emojiInfo.field_catalog;
            l75.e0 e0Var = com.tencent.mm.storage.emotion.EmojiInfo.L2;
            if (i17 != 81) {
                emojiInfo.field_catalog = 81;
                wq.a.f().d(emojiInfo, false);
                z17 = true;
                emojiInfo.field_reserved3 = com.tencent.mm.storage.n5.f().c().z1() + 1;
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10431, 0, emojiInfo.getMd5(), emojiInfo.field_designerID, emojiInfo.field_groupId, 0, 0, java.lang.Integer.valueOf(emojiInfo.field_size), nVar.f399136b, emojiInfo.field_activityid);
            } else {
                z17 = false;
            }
            if (z17) {
                com.tencent.mm.storage.n5.f().c().G2(emojiInfo);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.String md52 = emojiInfo.getMd5();
            kotlin.jvm.internal.o.f(md52, "getMd5(...)");
            arrayList.add(md52);
            com.tencent.mm.storage.n5.f().c().y2(0, arrayList);
            if (com.tencent.mm.storage.h5.f195006d.Ai()) {
                if (emojiInfo.field_isOcrProcessed == 0) {
                    com.tencent.mm.smiley.c0 c0Var = com.tencent.mm.smiley.c0.f193225a;
                    com.tencent.mars.xlog.Log.i("MicroMsg.EmojiOcrService", "restart");
                    c0Var.e(com.tencent.mm.smiley.v.f193398d);
                } else {
                    com.tencent.mm.storage.z4.f196391j.g();
                }
            } else if (!android.text.TextUtils.isEmpty(emojiInfo.field_meanings)) {
                com.tencent.mm.storage.z4 z4Var = com.tencent.mm.storage.z4.f196391j;
                if (z4Var.e()) {
                    z4Var.g();
                }
            }
            al5.u4 u4Var = nVar.f399140f;
            if (u4Var != null) {
                al5.t4 t4Var = u4Var.f6059d;
                t4Var.b(false);
                t4Var.f(false);
                t4Var.f6042e = u4Var.getContext().getString(com.tencent.mm.R.string.byc);
                t4Var.e(com.tencent.mm.R.raw.check_mark_regular);
                if (n22.m.p(emojiInfo)) {
                    al5.t4 t4Var2 = u4Var.f6059d;
                    t4Var2.a(u4Var.getContext().getString(com.tencent.mm.R.string.f492534gv4));
                    t4Var2.f6038a.f6014b = new rr.l(nVar);
                }
                u4Var.f6059d.i();
            }
        } else {
            al5.u4 u4Var2 = nVar.f399140f;
            if (u4Var2 != null) {
                al5.t4 t4Var3 = u4Var2.f6059d;
                t4Var3.b(false);
                t4Var3.f(false);
                t4Var3.f6042e = u4Var2.getContext().getString(com.tencent.mm.R.string.byf);
                t4Var3.i();
            }
        }
        return jz5.f0.f302826a;
    }
}
