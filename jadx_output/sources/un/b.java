package un;

/* loaded from: classes11.dex */
public final class b implements android.content.SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ un.h f429236a;

    public b(un.h hVar) {
        this.f429236a = hVar;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String str) {
        if (kotlin.jvm.internal.o.b("room_placed_to_the_top", str) || kotlin.jvm.internal.o.b("room_set_to_conv_box", str)) {
            if (sharedPreferences != null) {
                sharedPreferences.getBoolean(str, false);
            }
            this.f429236a.X6();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mm.sdk.platformtools.z3.b(true);
        }
    }
}
