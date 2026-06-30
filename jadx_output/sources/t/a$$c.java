package t;

/* loaded from: classes14.dex */
public final /* synthetic */ class a$$c implements androidx.camera.core.impl.UseCaseConfigFactory.Provider {
    @Override // androidx.camera.core.impl.UseCaseConfigFactory.Provider
    public final androidx.camera.core.impl.UseCaseConfigFactory newInstance(android.content.Context context) {
        androidx.camera.core.impl.UseCaseConfigFactory lambda$defaultConfig$1;
        lambda$defaultConfig$1 = androidx.camera.camera2.Camera2Config.lambda$defaultConfig$1(context);
        return lambda$defaultConfig$1;
    }
}
