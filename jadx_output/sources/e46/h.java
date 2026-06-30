package e46;

/* loaded from: classes16.dex */
public class h extends e46.d {

    /* renamed from: a, reason: collision with root package name */
    public final long f249449a;

    /* renamed from: b, reason: collision with root package name */
    public long f249450b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e46.i f249451c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(e46.i iVar, long j17, e46.b bVar) {
        super(null);
        this.f249451c = iVar;
        this.f249449a = j17;
    }

    @Override // e46.d
    public int a() {
        long j17 = this.f249449a - this.f249450b;
        r46.a aVar = this.f249451c.f249459f;
        return (int) java.lang.Math.min(j17, (aVar.f392499g + (aVar.f392496d.available() * 8)) / 8);
    }

    @Override // e46.d
    public boolean b() {
        return this.f249450b < this.f249449a;
    }

    @Override // e46.d
    public int c(byte[] bArr, int i17, int i18) {
        int i19;
        int i27 = 0;
        if (i18 == 0) {
            return 0;
        }
        int min = (int) java.lang.Math.min(this.f249449a - this.f249450b, i18);
        while (i27 < min) {
            e46.i iVar = this.f249451c;
            if (iVar.f249459f.f392499g > 0) {
                byte f17 = (byte) iVar.f(8);
                iVar.f249461h.a(f17);
                bArr[i17 + i27] = f17;
                i19 = 1;
            } else {
                int i28 = i17 + i27;
                int read = iVar.f249460g.read(bArr, i28, min - i27);
                if (read == -1) {
                    throw new java.io.EOFException("Truncated Deflate64 Stream");
                }
                e46.e eVar = iVar.f249461h;
                eVar.getClass();
                for (int i29 = i28; i29 < i28 + read; i29++) {
                    eVar.a(bArr[i29]);
                }
                i19 = read;
            }
            this.f249450b += i19;
            i27 += i19;
        }
        return min;
    }

    @Override // e46.d
    public e46.j d() {
        return this.f249450b < this.f249449a ? e46.j.STORED : e46.j.INITIAL;
    }
}
