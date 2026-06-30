package r14;

/* loaded from: classes5.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r14.y f368615d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(r14.y yVar) {
        super(1);
        this.f368615d = yVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        byte[] bArr;
        java.lang.String it = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.ui.MMActivity context = this.f368615d.f368633a;
        kotlin.jvm.internal.o.g(context, "context");
        android.net.Uri b17 = com.tencent.mm.sdk.platformtools.i1.b(context, new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(it)));
        if (b17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.QQShareUtil", "shareToQQ() called ".concat(it));
        } else {
            context.grantUriPermission("com.tencent.mobileqq", b17, 1);
            java.lang.String uri = b17.toString();
            kotlin.jvm.internal.o.f(uri, "toString(...)");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(uri)) {
                try {
                    java.nio.charset.Charset forName = java.nio.charset.Charset.forName(com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
                    kotlin.jvm.internal.o.f(forName, "forName(...)");
                    bArr = uri.getBytes(forName);
                    kotlin.jvm.internal.o.f(bArr, "getBytes(...)");
                } catch (java.io.UnsupportedEncodingException e17) {
                    byte[] bytes = uri.getBytes(r26.c.f368865a);
                    kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
                    com.tencent.mars.xlog.Log.e("MicroMsg.QQShareUtil", "getBytes fail, throw : %s", e17.getMessage());
                    bArr = bytes;
                }
                uri = android.util.Base64.encodeToString(bArr, 2);
                kotlin.jvm.internal.o.f(uri, "encodeToString(...)");
            }
            java.lang.String format = java.lang.String.format("mqqapi://share/to_fri?file_type=news&share_id=1103188687&file_uri=%s&app_name=5b6u5L+h&req_type=NQ==&cflag=MQ==", java.util.Arrays.copyOf(new java.lang.Object[]{uri}, 1));
            kotlin.jvm.internal.o.f(format, "format(...)");
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(format));
            intent.putExtra("pkg_name", "com.tencent.mm");
            intent.setFlags(268435456);
            if (com.tencent.mm.sdk.platformtools.t8.I0(context, intent, true, false)) {
                try {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/utils/QQShareUtil", "shareToQZone", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(context, "com/tencent/mm/plugin/setting/ui/utils/QQShareUtil", "shareToQZone", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } catch (android.content.ActivityNotFoundException e18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.QQShareUtil", e18, "", new java.lang.Object[0]);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
