package gj;

/* loaded from: classes12.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f272340a;

    /* renamed from: b, reason: collision with root package name */
    public gj.e f272341b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f272342c = false;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f272343d;

    public e(int i17) {
        this.f272340a = i17;
    }

    public void a() {
        gj.e eVar;
        this.f272342c = false;
        gj.e eVar2 = null;
        for (eVar = com.tencent.matrix.trace.core.AppMethodBeat.sIndexRecordHead; eVar != null; eVar = eVar.f272341b) {
            if (eVar == this) {
                if (eVar2 != null) {
                    eVar2.f272341b = eVar.f272341b;
                } else {
                    gj.e unused = com.tencent.matrix.trace.core.AppMethodBeat.sIndexRecordHead = eVar.f272341b;
                }
                eVar.f272341b = null;
                return;
            }
            eVar2 = eVar;
        }
    }

    public java.lang.String toString() {
        return "index:" + this.f272340a + ",\tisValid:" + this.f272342c + " source:" + this.f272343d;
    }

    public e() {
    }
}
