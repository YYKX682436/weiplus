package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes8.dex */
public final class tb0 extends pk3.h {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tb0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // pk3.b
    public boolean M9(int i17) {
        return i17 == 25;
    }

    @Override // pk3.h
    public void P6(android.view.View view, com.tencent.mm.plugin.multitask.model.MultiTaskInfo info, r45.fr4 animateData, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(animateData, "animateData");
        com.tencent.mm.plugin.finder.megavideo.multitask.m mVar = com.tencent.mm.plugin.finder.megavideo.multitask.n.f120873z;
        android.content.Context context = view != null ? view.getContext() : null;
        mVar.a(info, animateData, true, context instanceof android.app.Activity ? (android.app.Activity) context : null);
    }

    @Override // pk3.h
    public void Q6(com.tencent.mm.plugin.multitask.model.MultiTaskInfo obj, int i17) {
        kotlin.jvm.internal.o.g(obj, "obj");
        com.tencent.mm.plugin.finder.report.b6 b6Var = com.tencent.mm.plugin.finder.report.b6.f124969a;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("feedid", obj.field_id);
        jSONObject.put("feed_index", i17 + 1);
        jSONObject.put("import_time", obj.field_createTime);
        com.tencent.mm.plugin.finder.report.b6.d(b6Var, null, "float_feed_delete", 1, jSONObject, false, null, 48, null);
    }

    @Override // pk3.h
    public void S6() {
    }

    @Override // pk3.h
    public void T6() {
    }

    @Override // pk3.h
    public void U6(com.tencent.mm.plugin.multitask.model.MultiTaskInfo info, int i17) {
        kotlin.jvm.internal.o.g(info, "info");
        com.tencent.mm.plugin.finder.report.b6 b6Var = com.tencent.mm.plugin.finder.report.b6.f124969a;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("feedid", info.field_id);
        jSONObject.put("feed_index", i17 + 1);
        jSONObject.put("import_time", info.field_createTime);
        com.tencent.mm.plugin.finder.report.b6.d(b6Var, null, "float_feed", 0, jSONObject, false, null, 48, null);
    }

    @Override // pk3.b
    public pk3.a i0() {
        return pk3.a.f356435e;
    }
}
