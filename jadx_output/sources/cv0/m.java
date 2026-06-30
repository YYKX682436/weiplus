package cv0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class m {

    /* renamed from: e, reason: collision with root package name */
    public static final cv0.m f222543e;

    /* renamed from: f, reason: collision with root package name */
    public static final cv0.m f222544f;

    /* renamed from: g, reason: collision with root package name */
    public static final cv0.m f222545g;

    /* renamed from: h, reason: collision with root package name */
    public static final cv0.m f222546h;

    /* renamed from: i, reason: collision with root package name */
    public static final cv0.m f222547i;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ cv0.m[] f222548m;

    /* renamed from: d, reason: collision with root package name */
    public final int f222549d;

    static {
        cv0.m mVar = new cv0.m("None", 0, -1);
        f222543e = mVar;
        cv0.m mVar2 = new cv0.m("Delete", 1, com.tencent.mm.R.drawable.icon_handlebox_delete);
        f222544f = mVar2;
        cv0.m mVar3 = new cv0.m("Edit", 2, com.tencent.mm.R.drawable.icon_handlebox_edit);
        f222545g = mVar3;
        cv0.m mVar4 = new cv0.m("ChangeTimeRange", 3, com.tencent.mm.R.drawable.icon_handlebox_set_duration);
        f222546h = mVar4;
        cv0.m mVar5 = new cv0.m("TEXT_READ", 4, com.tencent.mm.R.drawable.icon_handlebox_text_read);
        f222547i = mVar5;
        cv0.m[] mVarArr = {mVar, mVar2, mVar3, mVar4, mVar5};
        f222548m = mVarArr;
        rz5.b.a(mVarArr);
    }

    public m(java.lang.String str, int i17, int i18) {
        this.f222549d = i18;
    }

    public static cv0.m valueOf(java.lang.String str) {
        return (cv0.m) java.lang.Enum.valueOf(cv0.m.class, str);
    }

    public static cv0.m[] values() {
        return (cv0.m[]) f222548m.clone();
    }
}
