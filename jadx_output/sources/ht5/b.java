package ht5;

/* loaded from: classes13.dex */
public final class b extends com.qq.taf.jce.JceStruct {

    /* renamed from: d, reason: collision with root package name */
    public int f284971d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f284972e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f284973f = 0;

    @Override // com.qq.taf.jce.JceStruct
    public void readFrom(com.qq.taf.jce.JceInputStream jceInputStream) {
        this.f284971d = jceInputStream.read(this.f284971d, 1, true);
        this.f284972e = jceInputStream.read(this.f284972e, 2, true);
        this.f284973f = jceInputStream.read(this.f284973f, 3, true);
    }

    @Override // com.qq.taf.jce.JceStruct
    public void writeTo(com.qq.taf.jce.JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.f284971d, 1);
        jceOutputStream.write(this.f284972e, 2);
        jceOutputStream.write(this.f284973f, 3);
    }
}
