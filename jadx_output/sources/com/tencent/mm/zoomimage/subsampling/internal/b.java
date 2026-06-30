package com.tencent.mm.zoomimage.subsampling.internal;

/* loaded from: classes5.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.zoomimage.subsampling.internal.d f214918d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.tencent.mm.zoomimage.subsampling.internal.d dVar) {
        super(0);
        this.f214918d = dVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yq5.f fVar = this.f214918d.f214929e;
        kotlin.jvm.internal.o.g(fVar, "<this>");
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(((yq5.b) fVar).f464589a);
        java.lang.String str = a17.f213279f;
        if (str != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        java.io.InputStream D = com.tencent.mm.vfs.w6.D(a17, com.tencent.mm.vfs.a3.f212781a.m(a17, null));
        try {
            int attributeInt = new androidx.exifinterface.media.ExifInterface(D).getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, 0);
            vz5.b.a(D, null);
            return new com.tencent.mm.zoomimage.subsampling.internal.e(attributeInt);
        } finally {
        }
    }
}
