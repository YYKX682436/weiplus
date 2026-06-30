package dk2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class gc {

    /* renamed from: d, reason: collision with root package name */
    public static final dk2.gc f233524d;

    /* renamed from: e, reason: collision with root package name */
    public static final dk2.gc f233525e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ dk2.gc[] f233526f;

    static {
        dk2.gc gcVar = new dk2.gc("SingleResponseChoice", 0, 1);
        f233524d = gcVar;
        dk2.gc gcVar2 = new dk2.gc("MultipleResponseChoice", 1, 4);
        f233525e = gcVar2;
        dk2.gc[] gcVarArr = {gcVar, gcVar2};
        f233526f = gcVarArr;
        rz5.b.a(gcVarArr);
    }

    public gc(java.lang.String str, int i17, int i18) {
    }

    public static dk2.gc valueOf(java.lang.String str) {
        return (dk2.gc) java.lang.Enum.valueOf(dk2.gc.class, str);
    }

    public static dk2.gc[] values() {
        return (dk2.gc[]) f233526f.clone();
    }
}
