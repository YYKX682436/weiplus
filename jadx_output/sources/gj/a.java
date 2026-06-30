package gj;

/* loaded from: classes12.dex */
public class a implements jj.d {
    @Override // jj.d
    public void b(java.lang.String str, long j17, long j18) {
        com.tencent.matrix.trace.core.AppMethodBeat.dispatchEnd();
    }

    @Override // jj.d
    public void c(java.lang.String str) {
        com.tencent.matrix.trace.core.AppMethodBeat.dispatchBegin();
    }

    @Override // jj.d
    public boolean isValid() {
        int i17;
        i17 = com.tencent.matrix.trace.core.AppMethodBeat.status;
        return i17 >= 1;
    }
}
