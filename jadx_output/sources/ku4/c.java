package ku4;

/* loaded from: classes7.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final ku4.c f312508d = new ku4.c();

    @Override // java.lang.Runnable
    public final void run() {
        ku4.i iVar = ku4.i.f312514a;
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList((java.util.LinkedList) ((jz5.n) ku4.i.f312515b).getValue());
        com.tencent.mars.xlog.Log.i("MicroMsg.WebCanvasPackageDownManager", "init appId size = " + linkedList.size());
        for (java.lang.String str : linkedList) {
            ku4.i iVar2 = ku4.i.f312514a;
            kotlin.jvm.internal.o.d(str);
            com.tencent.mm.plugin.appbrand.appcache.n9 a17 = iVar2.a(str, 0);
            if (a17 != null) {
                iVar2.b(str, a17.field_version);
                int o17 = ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) ku4.i.f312516c).getValue()).o("LastUseVersion_".concat(str), a17.field_version);
                if (!(o17 == a17.field_version)) {
                    iVar2.b(str, o17);
                }
            }
        }
    }
}
