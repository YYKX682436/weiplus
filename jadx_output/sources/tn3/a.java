package tn3;

/* loaded from: classes13.dex */
public final class a extends com.tencent.mm.plugin.newtips.model.j {
    @Override // com.tencent.mm.plugin.newtips.model.j
    public boolean a(int i17, java.util.List list) {
        if (i17 != 70001002) {
            return true;
        }
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        kotlin.jvm.internal.o.f(packageManager, "getPackageManager(...)");
        android.content.Intent intent = new android.content.Intent("android.intent.action.MAIN", (android.net.Uri) null);
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setPackage("com.tencent.wetype");
        return !(packageManager.resolveActivity(intent, 0) != null);
    }

    @Override // com.tencent.mm.plugin.newtips.model.j
    public boolean b(com.tencent.mm.plugin.newtips.model.k kVar) {
        if (!(kVar != null && kVar.field_tipId == 70001002)) {
            return true;
        }
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        kotlin.jvm.internal.o.f(packageManager, "getPackageManager(...)");
        android.content.Intent intent = new android.content.Intent("android.intent.action.MAIN", (android.net.Uri) null);
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setPackage("com.tencent.wetype");
        return !(packageManager.resolveActivity(intent, 0) != null);
    }
}
