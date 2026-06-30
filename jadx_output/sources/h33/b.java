package h33;

/* loaded from: classes.dex */
public final class b extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f278454d = new java.util.ArrayList();

    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public kotlinx.coroutines.flow.j a(v65.i scope, ym3.c request) {
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlin.jvm.internal.o.g(request, "request");
        kotlinx.coroutines.flow.i2 b17 = kotlinx.coroutines.flow.r2.b(0, 0, null, 7, null);
        v65.i.b(scope, null, new h33.a(request, this, b17, null), 1, null);
        return b17;
    }

    @Override // ym3.f
    public void onCreate() {
        java.lang.Object b17 = c01.n2.d().c("data_center_album_file_preview_data_list", true).b("album_file_preview_data_list");
        java.util.ArrayList arrayList = b17 instanceof java.util.ArrayList ? (java.util.ArrayList) b17 : null;
        if (arrayList != null) {
            ((java.util.ArrayList) this.f278454d).addAll(arrayList);
        }
    }
}
