package f93;

/* loaded from: classes11.dex */
public final class b5 extends com.tencent.mm.ui.contact.item.a {
    public static final /* synthetic */ int I = 0;
    public final java.lang.String C;
    public final f93.z4 D;
    public final int E;
    public final f93.u4 F;
    public f93.a5 G;
    public java.lang.Integer H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5(int i17, java.lang.String labelString) {
        super(1, i17);
        kotlin.jvm.internal.o.g(labelString, "labelString");
        this.C = labelString;
        this.D = new f93.z4(this);
        this.E = 36;
        this.F = new f93.u4(this);
        this.H = 0;
    }

    @Override // com.tencent.mm.ui.contact.item.d
    public void a(android.content.Context context, com.tencent.mm.ui.contact.item.b bVar) {
    }

    @Override // com.tencent.mm.ui.contact.item.d
    public com.tencent.mm.ui.contact.item.c b() {
        return this.D;
    }
}
