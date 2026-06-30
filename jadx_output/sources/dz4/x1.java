package dz4;

/* loaded from: classes12.dex */
public final class x1 {

    /* renamed from: a, reason: collision with root package name */
    public final ih0.p f245451a;

    /* renamed from: b, reason: collision with root package name */
    public dz4.k0 f245452b;

    public x1(ih0.p holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        this.f245451a = holder;
    }

    public final android.net.Uri a(android.content.Context context, java.lang.String str) {
        try {
            return com.tencent.mm.sdk.platformtools.i1.a(context, new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str)));
        } catch (java.lang.IllegalArgumentException e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WeNoteFlutterFileHelper", "safeGetUriForExportableFile, warning for path: " + str, e17);
            return null;
        }
    }
}
