package dn;

/* loaded from: classes12.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f241764a;
    public long field_finishedLength;
    public boolean field_isUploadTask = false;
    public boolean field_mtlnotify;
    public int field_status;
    public long field_toltalLength;

    public java.lang.String toString() {
        return java.lang.String.format("id:%s total:%d finLen:%d status:%d,mtl:%b, upload:%b", this.f241764a, java.lang.Long.valueOf(this.field_toltalLength), java.lang.Long.valueOf(this.field_finishedLength), java.lang.Integer.valueOf(this.field_status), java.lang.Boolean.valueOf(this.field_mtlnotify), java.lang.Boolean.valueOf(this.field_isUploadTask));
    }
}
