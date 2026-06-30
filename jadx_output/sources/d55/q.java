package d55;

/* loaded from: classes12.dex */
public class q extends d55.o {
    public q(java.lang.String str, int i17) {
        super(str, java.lang.Integer.valueOf(i17));
    }

    @Override // d55.o
    public void a(android.content.SharedPreferences.Editor editor) {
        editor.putInt(this.f226600a, ((java.lang.Integer) this.f226601b).intValue());
    }

    @Override // d55.n
    public java.lang.String getDescription() {
        return "putInt(" + this.f226600a + ", " + this.f226601b + ")";
    }
}
