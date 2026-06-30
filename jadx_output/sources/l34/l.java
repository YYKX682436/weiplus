package l34;

/* loaded from: classes12.dex */
public final class l extends l34.c {

    /* renamed from: a, reason: collision with root package name */
    public static final l34.l f315440a = new l34.l();

    @Override // l34.c
    public android.content.Intent a() {
        android.content.Intent intent = new android.content.Intent();
        intent.setComponent(new android.content.ComponentName("com.miui.securitycenter", "com.miui.permcenter.permissions.PermissionsEditorActivity"));
        intent.putExtra("extra_pkgname", com.tencent.mm.sdk.platformtools.x2.f193072b);
        return intent;
    }
}
