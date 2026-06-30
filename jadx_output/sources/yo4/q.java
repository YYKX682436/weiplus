package yo4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class q {

    /* renamed from: d, reason: collision with root package name */
    public static final yo4.q f464300d;

    /* renamed from: e, reason: collision with root package name */
    public static final yo4.q f464301e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ yo4.q[] f464302f;

    static {
        yo4.q qVar = new yo4.q(com.google.android.gms.stats.netstats.NetstatsParserPatterns.TYPE_BACKGROUND_PATTERN, 0);
        yo4.q qVar2 = new yo4.q("GLOBAL_EDIT", 1);
        f464300d = qVar2;
        yo4.q qVar3 = new yo4.q("SINGLE_EDIT", 2);
        f464301e = qVar3;
        yo4.q[] qVarArr = {qVar, qVar2, qVar3};
        f464302f = qVarArr;
        rz5.b.a(qVarArr);
    }

    public q(java.lang.String str, int i17) {
    }

    public static yo4.q valueOf(java.lang.String str) {
        return (yo4.q) java.lang.Enum.valueOf(yo4.q.class, str);
    }

    public static yo4.q[] values() {
        return (yo4.q[]) f464302f.clone();
    }
}
