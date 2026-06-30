package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes.dex */
public final class j9 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.v9 f117171d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j9(com.tencent.mm.plugin.finder.live.viewmodel.v9 v9Var) {
        super(1);
        this.f117171d = v9Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.of1 it = (r45.of1) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.live.viewmodel.v9 v9Var = this.f117171d;
        v9Var.getClass();
        v9Var.A = it.getInteger(2);
        com.tencent.mars.xlog.Log.i(v9Var.f117485d, "updateVisitorRole chooseType:" + v9Var.A);
        int i17 = v9Var.A;
        if (i17 == 10001) {
            c61.ub ubVar = (c61.ub) i95.n0.c(c61.ub.class);
            androidx.appcompat.app.AppCompatActivity activity = v9Var.getActivity();
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KEY_ALIAS_VISITOR_NICKNAME", it.getString(0));
            intent.putExtra("KEY_ALIAS_VISITOR_AVATAR", it.getString(1));
            intent.putExtra("KEY_SOURCE", v9Var.getIntent().getIntExtra("KEY_SOURCE", 0));
            intent.putExtra("KEY_REPORT_TO_SVR_SCENE", v9Var.f117503y);
            intent.putExtra("KEY_REPORT_TO_SVR_TS", c01.id.a() - v9Var.f117504z);
            ((com.tencent.mm.plugin.finder.assist.i0) ubVar).Gj(activity, intent, 1);
        } else if (v9Var.f117502x) {
            kotlinx.coroutines.l.d(v9Var.f117501w, null, null, new com.tencent.mm.plugin.finder.live.viewmodel.u9(v9Var, null), 3, null);
        } else {
            v9Var.Q6(i17);
        }
        return jz5.f0.f302826a;
    }
}
