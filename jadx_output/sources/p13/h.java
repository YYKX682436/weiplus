package p13;

/* loaded from: classes12.dex */
public class h implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public p13.p f351090d;

    /* renamed from: e, reason: collision with root package name */
    public int f351091e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f351092f = -1;

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        return this.f351091e - ((p13.h) obj).f351091e;
    }

    public boolean h() {
        return (this.f351091e == -1 || this.f351092f == -1) ? false : true;
    }

    public java.lang.String toString() {
        java.lang.Object[] objArr = new java.lang.Object[3];
        p13.p pVar = this.f351090d;
        objArr[0] = pVar == null ? "" : pVar.a().replaceAll("\u200b", ",");
        objArr[1] = java.lang.Integer.valueOf(this.f351091e);
        objArr[2] = java.lang.Integer.valueOf(this.f351092f);
        return java.lang.String.format("FTSQueryHLRequest.Item %s %d %d", objArr);
    }
}
