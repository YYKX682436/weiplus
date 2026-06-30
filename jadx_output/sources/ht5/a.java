package ht5;

/* loaded from: classes13.dex */
public final class a extends com.qq.taf.jce.JceStruct {

    /* renamed from: d, reason: collision with root package name */
    public int f284969d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f284970e = 0;

    @Override // com.qq.taf.jce.JceStruct
    public void readFrom(com.qq.taf.jce.JceInputStream jceInputStream) {
        this.f284969d = jceInputStream.read(this.f284969d, 0, true);
        this.f284970e = jceInputStream.read(this.f284970e, 1, false);
    }

    @Override // com.qq.taf.jce.JceStruct
    public void writeTo(com.qq.taf.jce.JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.f284969d, 0);
        jceOutputStream.write(this.f284970e, 1);
    }
}
