package zk3;

/* loaded from: classes8.dex */
public final class e extends pk3.h {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // pk3.b
    public boolean M9(int i17) {
        return i17 == 28 || i17 == 29;
    }

    @Override // pk3.h
    public void P6(android.view.View view, com.tencent.mm.plugin.multitask.model.MultiTaskInfo info, r45.fr4 animateData, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(animateData, "animateData");
        r45.p74 p74Var = new r45.p74();
        try {
            p74Var.parseFrom(info.field_data);
            q80.d0 d0Var = new q80.d0();
            d0Var.f360649a = p74Var.getString(0);
            d0Var.f360650b = p74Var.getString(1);
            java.lang.String string = p74Var.getString(2);
            d0Var.f360651c = string != null ? new org.json.JSONObject(string).toString() : null;
            com.tencent.liteapp.storage.LiteAppReferrerInfo liteAppReferrerInfo = new com.tencent.liteapp.storage.LiteAppReferrerInfo();
            liteAppReferrerInfo.scene = com.tencent.liteapp.gen.LiteAppOpenScene.STAR;
            liteAppReferrerInfo.sceneId = p74Var.getString(0);
            java.lang.String string2 = p74Var.getString(3);
            liteAppReferrerInfo.extraData = string2 != null ? new org.json.JSONObject(string2) : null;
            d0Var.f360674z = liteAppReferrerInfo;
            r45.w60 w60Var = new r45.w60();
            w60Var.set(2, java.lang.Boolean.TRUE);
            w60Var.set(0, animateData);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putByteArray("key_multi_task_common_info", w60Var.toByteArray());
            bundle.putString("coverBitmapPath", com.tencent.mm.plugin.multitask.u0.f150506a.c(info));
            d0Var.f360655g = bundle;
            d0Var.f360664p = com.tencent.mm.R.anim.f477728p;
            d0Var.f360665q = com.tencent.mm.R.anim.f477728p;
            d0Var.A = 180;
            d0Var.C = 1;
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).lk(getContext(), d0Var, new zk3.d());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("LiteAppMultiTaskUIC", e17.getMessage());
        }
    }

    @Override // pk3.b
    public pk3.a i0() {
        return pk3.a.f356435e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
    }
}
