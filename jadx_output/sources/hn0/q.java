package hn0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: d, reason: collision with root package name */
    public static final hn0.q f282407d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ hn0.q[] f282408e;

    static {
        hn0.q qVar = new hn0.q(com.google.android.gms.stats.netstats.NetstatsParserPatterns.TYPE_BACKGROUND_PATTERN, 0);
        hn0.q qVar2 = new hn0.q("AUDITION", 1);
        f282407d = qVar2;
        hn0.q[] qVarArr = {qVar, qVar2};
        f282408e = qVarArr;
        rz5.b.a(qVarArr);
    }

    public q(java.lang.String str, int i17) {
    }

    public static hn0.q valueOf(java.lang.String str) {
        return (hn0.q) java.lang.Enum.valueOf(hn0.q.class, str);
    }

    public static hn0.q[] values() {
        return (hn0.q[]) f282408e.clone();
    }
}
