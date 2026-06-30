package rk4;

/* loaded from: classes11.dex */
public abstract class y3 extends w71.v0 {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f397098e;

    public y3(java.util.Map map, int i17, kotlin.jvm.internal.i iVar) {
        this.f397098e = (i17 & 1) != 0 ? new java.util.LinkedHashMap() : map;
    }

    @Override // w71.t0
    public bw5.g20 nb() {
        java.util.Map map = this.f397098e;
        bw5.g20 a17 = map != null ? km4.f.a(map) : null;
        return a17 == null ? new bw5.g20() : a17;
    }

    @Override // w71.t0
    public java.lang.String r() {
        return "java";
    }
}
