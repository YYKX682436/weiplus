package tb4;

/* loaded from: classes11.dex */
public class d extends com.tencent.mm.ui.contact.item.a {

    /* renamed from: J, reason: collision with root package name */
    public static final java.util.regex.Pattern f417024J = java.util.regex.Pattern.compile(";");
    public java.lang.CharSequence C;
    public java.lang.CharSequence D;
    public android.view.View.OnClickListener E;
    public p13.y F;
    public boolean G;
    public final tb4.c H;
    public final tb4.a I;

    public d(int i17) {
        super(4, i17);
        this.E = null;
        this.G = true;
        this.H = new tb4.c(this);
        this.I = new tb4.a(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x015c  */
    @Override // com.tencent.mm.ui.contact.item.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(android.content.Context r18, com.tencent.mm.ui.contact.item.b r19) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tb4.d.a(android.content.Context, com.tencent.mm.ui.contact.item.b):void");
    }

    @Override // com.tencent.mm.ui.contact.item.d
    public com.tencent.mm.ui.contact.item.c b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getViewItem", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsSelectChatRoomDataItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewItem", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsSelectChatRoomDataItem");
        return this.H;
    }
}
