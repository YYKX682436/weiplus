package com.tencent.mm.plugin.ringtone.uic;

/* loaded from: classes5.dex */
public final class s2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ringtone.uic.b3 f158486d;

    public s2(com.tencent.mm.plugin.ringtone.uic.b3 b3Var) {
        this.f158486d = b3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ringtone/uic/RingtoneSelectMainUIC$onCreateAfter$5$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        androidx.appcompat.app.AppCompatActivity activity = this.f158486d.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        ((com.tencent.mm.plugin.ringtone.uic.v) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.ringtone.uic.v.class)).T6();
        yj0.a.h(this, "com/tencent/mm/plugin/ringtone/uic/RingtoneSelectMainUIC$onCreateAfter$5$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
