package dc3;

/* loaded from: classes8.dex */
public final class d extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f228710e = {l75.n0.getCreateSQLs(dc3.c.B, "LocalStoryDetail")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f228711d;

    public d(l75.k0 k0Var) {
        super(k0Var, dc3.c.B, "LocalStoryDetail", dm.t7.f240130p);
        this.f228711d = k0Var;
    }

    public java.util.List y0(java.lang.String str) {
        android.database.Cursor B = this.f228711d.B(java.lang.String.format("SELECT * from %s where %s=?", "LocalStoryDetail", "packet_id"), new java.lang.String[]{str});
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (B.moveToNext()) {
            dc3.c cVar = new dc3.c();
            cVar.convertFrom(B);
            r45.re6 re6Var = new r45.re6();
            re6Var.f384777g = cVar.field_height;
            re6Var.f384778h = cVar.field_width;
            re6Var.f384774d = cVar.field_media_type;
            re6Var.f384775e = cVar.field_media_url;
            re6Var.f384776f = cVar.field_media_md5;
            re6Var.f384779i = cVar.field_media_fuzzy_thumbnail_url;
            re6Var.f384780m = cVar.field_media_fuzzy_thumbnail_md5;
            arrayList.add(re6Var);
        }
        B.close();
        return arrayList;
    }
}
