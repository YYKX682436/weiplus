package ym0;

/* loaded from: classes7.dex */
public final class k implements ym0.j {
    public final void a(java.lang.String str) {
        java.lang.Object[] objArr = new java.lang.Object[0];
        ym0.i.f463129a.e("WebRTC.ReportDelegate", "Should not invoke " + str + " in default way!", java.util.Arrays.copyOf(objArr, objArr.length));
    }

    @Override // ym0.j
    public void idKeyReport(int i17, int i18, int i19) {
        a("idKeyReport");
    }

    @Override // ym0.j
    public void kvReport(int i17, java.lang.String str) {
        a(vd1.h.NAME);
    }
}
