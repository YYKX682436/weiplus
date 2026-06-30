package hn0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class u {

    /* renamed from: e, reason: collision with root package name */
    public static final hn0.u f282437e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ hn0.u[] f282438f;

    /* renamed from: d, reason: collision with root package name */
    public final int f282439d;

    static {
        hn0.u uVar = new hn0.u("SEIMode_OFF", 0, 0);
        hn0.u uVar2 = new hn0.u("SEIMode_GAMEREPORT", 1, 1);
        hn0.u uVar3 = new hn0.u("SEIMode_SUBTITLE", 2, 2);
        hn0.u uVar4 = new hn0.u("SEIMode_LINKMIC", 3, 4);
        hn0.u uVar5 = new hn0.u("SEIMode_OWD", 4, 8);
        hn0.u uVar6 = new hn0.u("SEIMode_ANCHOR_INFO", 5, 16);
        f282437e = uVar6;
        hn0.u[] uVarArr = {uVar, uVar2, uVar3, uVar4, uVar5, uVar6, new hn0.u("SEIMODE_GESTUREINFO", 6, 32), new hn0.u("SEIMODE_ANCHOR_MASK", 7, 128), new hn0.u("SEIMODE_KTV_SINGER", 8, 256), new hn0.u("SEIMODE_CDN_INFO", 9, 512), new hn0.u("SEIMODE_NEW_MUSIC", 10, 1024)};
        f282438f = uVarArr;
        rz5.b.a(uVarArr);
    }

    public u(java.lang.String str, int i17, int i18) {
        this.f282439d = i18;
    }

    public static hn0.u valueOf(java.lang.String str) {
        return (hn0.u) java.lang.Enum.valueOf(hn0.u.class, str);
    }

    public static hn0.u[] values() {
        return (hn0.u[]) f282438f.clone();
    }

    public final int h() {
        return this.f282439d;
    }
}
