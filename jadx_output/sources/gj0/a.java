package gj0;

/* loaded from: classes7.dex */
public class a extends gj0.b {
    @Override // gj0.b
    public int b() {
        if (com.tencent.mm.app.v5.a(com.tencent.mm.sdk.platformtools.i.a()) == com.tencent.mm.app.v5.f53864x || !com.tencent.mm.sdk.platformtools.z.f193115k || wo.w0.q()) {
            return 0;
        }
        android.app.Application a17 = com.tencent.mm.sdk.platformtools.i.a();
        android.content.Intent putExtra = new android.content.Intent(a17, (java.lang.Class<?>) com.tencent.mm.ui.NoRomSpaceDexUI.class).addFlags(268435456).putExtra("titleRes", com.tencent.mm.R.string.a6i).putExtra("messageRes", com.tencent.mm.R.string.a6h).putExtra("buttonRes", com.tencent.mm.R.string.a6g).putExtra("action", android.app.PendingIntent.getActivity(a17, 0, new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse("http://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyt) + "/")).addFlags(268435456), fp.g0.a(0)));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(putExtra);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(a17, arrayList.toArray(), "com/tencent/mm/fuse/AbiCompatFuse", "checkForFuseAction", "()I", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        a17.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(a17, "com/tencent/mm/fuse/AbiCompatFuse", "checkForFuseAction", "()I", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return 2;
    }

    @Override // gj0.b
    public java.lang.String c() {
        return "abi-compat";
    }
}
