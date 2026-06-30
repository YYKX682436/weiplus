package df3;

/* loaded from: classes7.dex */
public final class j implements android.content.ComponentCallbacks {
    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        com.tencent.wemagic.common.zidl_gen.c.f220085b.b((newConfig.uiMode & 48) == 32);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }
}
