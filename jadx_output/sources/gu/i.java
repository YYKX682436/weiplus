package gu;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class i {

    /* renamed from: d, reason: collision with root package name */
    public static final gu.i f275603d;

    /* renamed from: e, reason: collision with root package name */
    public static final gu.i f275604e;

    /* renamed from: f, reason: collision with root package name */
    public static final gu.i f275605f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ gu.i[] f275606g;

    static {
        gu.i iVar = new gu.i("Success", 0);
        f275603d = iVar;
        gu.i iVar2 = new gu.i("Fail", 1);
        gu.i iVar3 = new gu.i("EmptyMsgList", 2);
        f275604e = iVar3;
        gu.i iVar4 = new gu.i("BuildRecordXmlFail", 3);
        f275605f = iVar4;
        gu.i[] iVarArr = {iVar, iVar2, iVar3, iVar4};
        f275606g = iVarArr;
        rz5.b.a(iVarArr);
    }

    public i(java.lang.String str, int i17) {
    }

    public static gu.i valueOf(java.lang.String str) {
        return (gu.i) java.lang.Enum.valueOf(gu.i.class, str);
    }

    public static gu.i[] values() {
        return (gu.i[]) f275606g.clone();
    }
}
