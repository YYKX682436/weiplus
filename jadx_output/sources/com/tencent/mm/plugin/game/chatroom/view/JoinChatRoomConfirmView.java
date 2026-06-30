package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes9.dex */
public class JoinChatRoomConfirmView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f138986d;

    /* renamed from: e, reason: collision with root package name */
    public long f138987e;

    /* renamed from: f, reason: collision with root package name */
    public long f138988f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f138989g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.LinearLayout f138990h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f138991i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f138992m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f138993n;

    public JoinChatRoomConfirmView(android.content.Context context) {
        super(context);
        a();
    }

    public final void a() {
        android.content.Context context = getContext();
        this.f138986d = context;
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.bmk, (android.view.ViewGroup) this, true);
        this.f138989g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f485443hp1);
        this.f138990h = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.hoz);
        this.f138991i = (android.widget.TextView) findViewById(com.tencent.mm.R.id.hon);
        this.f138992m = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.hp6);
        this.f138993n = (android.widget.TextView) findViewById(com.tencent.mm.R.id.hoq);
    }

    public final android.view.View b(com.tencent.mm.plugin.game.autogen.chatroom.RestrictRule restrictRule) {
        android.view.View inflate = android.view.LayoutInflater.from(this.f138986d).inflate(com.tencent.mm.R.layout.f488414sn, (android.view.ViewGroup) this, false);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f485444hp2);
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.f485442hp0);
        textView.setText(restrictRule.rule_desc);
        float q17 = i65.a.q(getContext());
        imageView.getLayoutParams().height = (int) (imageView.getLayoutParams().height * q17);
        imageView.getLayoutParams().width = (int) (imageView.getLayoutParams().width * q17);
        imageView.requestLayout();
        if (restrictRule.can_pass) {
            textView.setTextColor(this.f138986d.getResources().getColor(com.tencent.mm.R.color.f478551al));
            imageView.setImageResource(com.tencent.mm.R.raw.chat_room_rule_pass_dark);
        } else {
            textView.setTextColor(this.f138986d.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_5));
            imageView.setImageResource(com.tencent.mm.R.raw.chat_room_rule_reject_dark);
        }
        inflate.measure(0, 0);
        return inflate;
    }

    public JoinChatRoomConfirmView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public JoinChatRoomConfirmView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        a();
    }
}
