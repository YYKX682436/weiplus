package f12;

/* loaded from: classes4.dex */
public final class a0 implements androidx.lifecycle.f1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity f258568a;

    public a0(com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity springLuckyEggActivity) {
        this.f258568a = springLuckyEggActivity;
    }

    @Override // androidx.lifecycle.f1
    public androidx.lifecycle.c1 a(java.lang.Class modelClass) {
        kotlin.jvm.internal.o.g(modelClass, "modelClass");
        android.os.Bundle extras = this.f258568a.getIntent().getExtras();
        if (extras == null) {
            throw new java.lang.IllegalStateException("Required value was null.".toString());
        }
        java.lang.String string = extras.getString("egg_name");
        kotlin.jvm.internal.o.d(string);
        java.lang.String string2 = extras.getString("keyword");
        kotlin.jvm.internal.o.d(string2);
        return new f12.j0(string, string2, extras.getString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_APPID), extras.getString("trace_id"), extras.getString("background"));
    }
}
