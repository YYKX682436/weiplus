package s85;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final s85.c[] f404906a;

    public d(android.content.Context context) {
        s85.j jVar = new s85.j(context);
        this.f404906a = new s85.c[]{jVar.f404914a, jVar.f404915b};
        new java.util.HashMap();
    }

    public s85.c a(int i17, java.lang.Class cls) {
        if (i17 >= 0) {
            s85.c[] cVarArr = this.f404906a;
            if (i17 < cVarArr.length) {
                return cVarArr[i17];
            }
        }
        return null;
    }
}
