package gm0;

/* loaded from: classes8.dex */
public class c0 implements com.tencent.mm.vfs.b7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f273168a;

    public c0(gm0.d0 d0Var, java.lang.String str) {
        this.f273168a = str;
    }

    @Override // com.tencent.mm.vfs.b7
    public boolean a(com.tencent.mm.vfs.r6 r6Var, java.lang.String str) {
        java.lang.String str2 = this.f273168a;
        return str.startsWith(str2) && !str.equals(str2);
    }
}
