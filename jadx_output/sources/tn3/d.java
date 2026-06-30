package tn3;

/* loaded from: classes9.dex */
public class d extends com.tencent.mm.plugin.newtips.model.q {
    @Override // com.tencent.mm.plugin.newtips.model.q
    public boolean a(com.tencent.mm.plugin.newtips.model.k kVar) {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.g(context, "context");
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        kotlin.jvm.internal.o.f(packageManager, "getPackageManager(...)");
        android.content.Intent intent = new android.content.Intent("android.intent.action.MAIN", (android.net.Uri) null);
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setPackage("com.tencent.wetype");
        return !(packageManager.resolveActivity(intent, 0) != null);
    }
}
