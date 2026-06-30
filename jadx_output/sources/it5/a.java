package it5;

/* loaded from: classes13.dex */
public final class a extends com.qq.taf.jce.JceStruct {

    /* renamed from: g, reason: collision with root package name */
    public static final it5.c f294601g = new it5.c();

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.ArrayList f294602h;

    /* renamed from: i, reason: collision with root package name */
    public static final it5.d f294603i;

    /* renamed from: d, reason: collision with root package name */
    public it5.c f294604d = null;

    /* renamed from: e, reason: collision with root package name */
    public java.util.ArrayList f294605e = null;

    /* renamed from: f, reason: collision with root package name */
    public it5.d f294606f = null;

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        f294602h = arrayList;
        arrayList.add(new it5.b());
        f294603i = new it5.d();
    }

    @Override // com.qq.taf.jce.JceStruct
    public com.qq.taf.jce.JceStruct newInit() {
        return new it5.a();
    }

    @Override // com.qq.taf.jce.JceStruct
    public void readFrom(com.qq.taf.jce.JceInputStream jceInputStream) {
        this.f294604d = (it5.c) jceInputStream.read((com.qq.taf.jce.JceStruct) f294601g, 0, false);
        this.f294605e = (java.util.ArrayList) jceInputStream.read((com.qq.taf.jce.JceInputStream) f294602h, 1, false);
        this.f294606f = (it5.d) jceInputStream.read((com.qq.taf.jce.JceStruct) f294603i, 2, false);
    }

    @Override // com.qq.taf.jce.JceStruct
    public void writeTo(com.qq.taf.jce.JceOutputStream jceOutputStream) {
        it5.c cVar = this.f294604d;
        if (cVar != null) {
            jceOutputStream.write((com.qq.taf.jce.JceStruct) cVar, 0);
        }
        java.util.ArrayList arrayList = this.f294605e;
        if (arrayList != null) {
            jceOutputStream.write((java.util.Collection) arrayList, 1);
        }
        it5.d dVar = this.f294606f;
        if (dVar != null) {
            jceOutputStream.write((com.qq.taf.jce.JceStruct) dVar, 2);
        }
    }
}
