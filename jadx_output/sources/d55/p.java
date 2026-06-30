package d55;

/* loaded from: classes12.dex */
public class p extends d55.o {
    public p(java.lang.String str, boolean z17) {
        super(str, java.lang.Boolean.valueOf(z17));
    }

    @Override // d55.o
    public void a(android.content.SharedPreferences.Editor editor) {
        editor.putBoolean(this.f226600a, ((java.lang.Boolean) this.f226601b).booleanValue());
    }

    @Override // d55.n
    public java.lang.String getDescription() {
        return "putBoolean(" + this.f226600a + ", " + this.f226601b + ")";
    }
}
