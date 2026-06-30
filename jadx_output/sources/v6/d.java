package v6;

/* loaded from: classes13.dex */
public class d implements v6.f {

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String[] f433378b = {"_data"};

    /* renamed from: a, reason: collision with root package name */
    public final android.content.ContentResolver f433379a;

    public d(android.content.ContentResolver contentResolver) {
        this.f433379a = contentResolver;
    }

    @Override // v6.f
    public android.database.Cursor a(android.net.Uri uri) {
        return this.f433379a.query(android.provider.MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f433378b, "kind = 1 AND video_id = ?", new java.lang.String[]{uri.getLastPathSegment()}, null);
    }
}
