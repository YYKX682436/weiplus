package wk1;

/* loaded from: classes7.dex */
public class b extends wk1.f implements wk1.a {

    /* renamed from: g, reason: collision with root package name */
    public static final java.nio.ByteBuffer f446919g = java.nio.ByteBuffer.allocate(0);

    /* renamed from: e, reason: collision with root package name */
    public int f446920e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f446921f;

    public b() {
        super(wk1.d.CLOSING);
        this.f446930a = true;
    }

    @Override // wk1.f, wk1.e
    public java.nio.ByteBuffer a() {
        return this.f446920e == 1005 ? f446919g : this.f446932c;
    }

    @Override // wk1.f, wk1.c
    public void b(java.nio.ByteBuffer byteBuffer) {
        this.f446932c = byteBuffer;
        this.f446920e = 1005;
        byteBuffer.mark();
        if (byteBuffer.remaining() >= 2) {
            java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(4);
            allocate.position(2);
            allocate.putShort(byteBuffer.getShort());
            allocate.position(0);
            int i17 = allocate.getInt();
            this.f446920e = i17;
            if (i17 == 1006 || i17 == 1015 || i17 == 1005 || i17 > 4999 || i17 < 1000 || i17 == 1004) {
                throw new vk1.c("closecode must not be sent over the wire: " + this.f446920e);
            }
        }
        byteBuffer.reset();
        if (this.f446920e == 1005) {
            this.f446921f = yk1.c.a(this.f446932c);
            return;
        }
        java.nio.ByteBuffer byteBuffer2 = this.f446932c;
        int position = byteBuffer2.position();
        try {
            try {
                byteBuffer2.position(byteBuffer2.position() + 2);
                this.f446921f = yk1.c.a(byteBuffer2);
            } catch (java.lang.IllegalArgumentException e17) {
                throw new vk1.c(e17);
            }
        } finally {
            byteBuffer2.position(position);
        }
    }

    @Override // wk1.f
    public java.lang.String toString() {
        return super.toString() + "code: " + this.f446920e;
    }

    public b(int i17, java.lang.String str) {
        super(wk1.d.CLOSING);
        this.f446930a = true;
        java.lang.String str2 = "";
        str = str == null ? "" : str;
        if (i17 == 1015) {
            i17 = 1005;
        } else {
            str2 = str;
        }
        if (i17 == 1005) {
            if (str2.length() > 0) {
                throw new vk1.b(1002, "A close frame must have a closecode if it has a reason");
            }
            return;
        }
        byte[] b17 = yk1.c.b(str2);
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(4);
        allocate.putInt(i17);
        allocate.position(2);
        java.nio.ByteBuffer allocate2 = java.nio.ByteBuffer.allocate(b17.length + 2);
        allocate2.put(allocate);
        allocate2.put(b17);
        allocate2.rewind();
        b(allocate2);
    }
}
