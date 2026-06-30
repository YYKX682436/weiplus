package y42;

/* loaded from: classes7.dex */
public class c extends x42.a {

    /* renamed from: a, reason: collision with root package name */
    public p42.a f459344a;

    @Override // x42.b
    public java.lang.String a() {
        return "save_to_edge_table";
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x006c, code lost:
    
        if (r5.isReleased() == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003b, code lost:
    
        if (r5.isReleased() == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003d, code lost:
    
        r5.release();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0127, code lost:
    
        if (r15.isReleased() == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0129, code lost:
    
        r15.release();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x014f, code lost:
    
        if (r15.isReleased() == false) goto L89;
     */
    @Override // x42.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(com.eclipsesource.mmv8.V8Array r15) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y42.c.b(com.eclipsesource.mmv8.V8Array):java.lang.Object");
    }

    @Override // x42.b
    public int getType() {
        return 4;
    }

    @Override // x42.b
    public void release() {
        p42.a aVar = this.f459344a;
        if (aVar != null) {
            aVar.c();
            this.f459344a = null;
        }
    }
}
