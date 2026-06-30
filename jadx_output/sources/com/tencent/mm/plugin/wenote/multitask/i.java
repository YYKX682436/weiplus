package com.tencent.mm.plugin.wenote.multitask;

/* loaded from: classes8.dex */
public final class i extends pk3.h {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.wenote.multitask.h f188136d = new com.tencent.mm.plugin.wenote.multitask.h(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // pk3.b
    public boolean M9(int i17) {
        return i17 == 3;
    }

    @Override // pk3.h
    public void O6(java.lang.Object obj) {
    }

    @Override // pk3.h
    public void P6(android.view.View view, com.tencent.mm.plugin.multitask.model.MultiTaskInfo info, r45.fr4 animateData, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(animateData, "animateData");
        r45.w60 w60Var = new r45.w60();
        w60Var.set(0, animateData);
        w60Var.set(3, bm5.f1.a());
        if (view != null) {
            nd0.e eVar = (nd0.e) i95.n0.c(nd0.e.class);
            android.content.Context context = view.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            r45.kr4 kr4Var = (r45.kr4) ((md0.e) eVar).wi(context, 5);
            w60Var.set(1, kr4Var != null ? kr4Var.getString(0) : null);
        }
        r45.sw4 sw4Var = new r45.sw4();
        try {
            sw4Var.parseFrom(info.field_data);
            int integer = sw4Var.getInteger(0);
            java.lang.String string = sw4Var.getString(1);
            com.tencent.mm.plugin.wenote.multitask.h hVar = f188136d;
            java.lang.String field_id = info.field_id;
            kotlin.jvm.internal.o.f(field_id, "field_id");
            if (com.tencent.mm.sdk.platformtools.x2.n()) {
                hVar.a(field_id, w60Var, true, integer, string);
                return;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("isFromMultiTask", true);
            bundle.putString("eventData", string);
            bundle.putInt("eventType", integer);
            bundle.putByteArray("commonMultiTaskData", w60Var.toByteArray());
            bundle.putString("multiTaskId", field_id);
            com.tencent.mm.ipcinvoker.d0.f(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, com.tencent.mm.plugin.wenote.multitask.g.class);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NoteMultiTaskUIC", e17.getMessage());
        }
    }

    @Override // pk3.b
    public pk3.a i0() {
        return pk3.a.f356435e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
    }
}
