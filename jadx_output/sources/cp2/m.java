package cp2;

/* loaded from: classes2.dex */
public final class m extends com.tencent.mm.plugin.finder.feed.model.internal.IResponse {

    /* renamed from: a, reason: collision with root package name */
    public r45.ha2 f220848a;

    /* renamed from: b, reason: collision with root package name */
    public r45.wc1 f220849b;

    /* renamed from: c, reason: collision with root package name */
    public int f220850c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(int i17, int i18, java.lang.String str, r45.ha2 ha2Var, r45.wc1 wc1Var, int i19, int i27, kotlin.jvm.internal.i iVar) {
        super(i17, i18, str);
        ha2Var = (i27 & 8) != 0 ? null : ha2Var;
        wc1Var = (i27 & 16) != 0 ? null : wc1Var;
        i19 = (i27 & 32) != 0 ? -1 : i19;
        this.f220848a = ha2Var;
        this.f220849b = wc1Var;
        this.f220850c = i19;
    }
}
