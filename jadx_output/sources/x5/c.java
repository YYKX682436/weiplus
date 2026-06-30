package x5;

/* loaded from: classes14.dex */
public final class c implements x5.g {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f451942a;

    public c(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f451942a = context;
    }

    @Override // x5.g
    public boolean a(java.lang.Object obj) {
        android.net.Uri data = (android.net.Uri) obj;
        kotlin.jvm.internal.o.g(data, "data");
        return kotlin.jvm.internal.o.b(data.getScheme(), "content");
    }

    @Override // x5.g
    public java.lang.Object b(s5.a aVar, java.lang.Object obj, coil.size.Size size, v5.k kVar, kotlin.coroutines.Continuation continuation) {
        java.io.InputStream openInputStream;
        android.net.Uri data = (android.net.Uri) obj;
        kotlin.jvm.internal.o.g(data, "data");
        boolean z17 = kotlin.jvm.internal.o.b(data.getAuthority(), "com.android.contacts") && kotlin.jvm.internal.o.b(data.getLastPathSegment(), "display_photo");
        android.content.Context context = this.f451942a;
        if (z17) {
            android.content.res.AssetFileDescriptor openAssetFileDescriptor = context.getContentResolver().openAssetFileDescriptor(data, "r");
            openInputStream = openAssetFileDescriptor == null ? null : openAssetFileDescriptor.createInputStream();
            if (openInputStream == null) {
                throw new java.lang.IllegalStateException(("Unable to find a contact photo associated with '" + data + "'.").toString());
            }
        } else {
            openInputStream = context.getContentResolver().openInputStream(data);
            if (openInputStream == null) {
                throw new java.lang.IllegalStateException(("Unable to open '" + data + "'.").toString());
            }
        }
        return new x5.n(x36.v.b(x36.v.f(openInputStream)), context.getContentResolver().getType(data), v5.d.DISK);
    }

    @Override // x5.g
    public java.lang.String c(java.lang.Object obj) {
        android.net.Uri data = (android.net.Uri) obj;
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String uri = data.toString();
        kotlin.jvm.internal.o.f(uri, "data.toString()");
        return uri;
    }
}
