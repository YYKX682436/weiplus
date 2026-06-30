package wk1;

/* loaded from: classes7.dex */
public class f implements wk1.c {

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f446929d = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public boolean f446930a;

    /* renamed from: b, reason: collision with root package name */
    public wk1.d f446931b;

    /* renamed from: c, reason: collision with root package name */
    public java.nio.ByteBuffer f446932c;

    public f(wk1.d dVar) {
        this.f446931b = dVar;
        this.f446932c = java.nio.ByteBuffer.wrap(f446929d);
    }

    @Override // wk1.e
    public java.nio.ByteBuffer a() {
        return this.f446932c;
    }

    @Override // wk1.c
    public void b(java.nio.ByteBuffer byteBuffer) {
        this.f446932c = byteBuffer;
    }

    public void c(wk1.e eVar) {
        java.nio.ByteBuffer a17 = eVar.a();
        if (this.f446932c == null) {
            this.f446932c = java.nio.ByteBuffer.allocate(a17.remaining());
            a17.mark();
            this.f446932c.put(a17);
            a17.reset();
        } else {
            a17.mark();
            java.nio.ByteBuffer byteBuffer = this.f446932c;
            byteBuffer.position(byteBuffer.limit());
            java.nio.ByteBuffer byteBuffer2 = this.f446932c;
            byteBuffer2.limit(byteBuffer2.capacity());
            if (a17.remaining() > this.f446932c.remaining()) {
                java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(a17.remaining() + this.f446932c.capacity());
                this.f446932c.flip();
                allocate.put(this.f446932c);
                allocate.put(a17);
                this.f446932c = allocate;
            } else {
                this.f446932c.put(a17);
            }
            this.f446932c.rewind();
            a17.reset();
        }
        this.f446930a = ((wk1.f) eVar).f446930a;
    }

    public java.lang.String toString() {
        return "Framedata{ optcode:" + this.f446931b + ", fin:" + this.f446930a + ", payloadlength:[pos:" + this.f446932c.position() + ", len:" + this.f446932c.remaining() + "], payload:" + java.util.Arrays.toString(yk1.c.b(new java.lang.String(this.f446932c.array()))) + "}";
    }

    public f(wk1.e eVar) {
        wk1.f fVar = (wk1.f) eVar;
        this.f446930a = fVar.f446930a;
        this.f446931b = fVar.f446931b;
        this.f446932c = eVar.a();
    }
}
