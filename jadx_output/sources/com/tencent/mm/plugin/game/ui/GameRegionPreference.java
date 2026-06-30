package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class GameRegionPreference extends com.tencent.mm.ui.base.preference.Preference {
    public com.tencent.mm.plugin.game.ui.p5 L;

    public GameRegionPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        com.tencent.mm.plugin.game.ui.p5 p5Var;
        super.t(view);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.ls9);
        android.widget.CheckBox checkBox = (android.widget.CheckBox) view.findViewById(com.tencent.mm.R.id.nh8);
        if (textView == null || checkBox == null || (p5Var = this.L) == null) {
            return;
        }
        textView.setText(com.tencent.mm.plugin.game.model.f.i(p5Var));
        checkBox.setChecked(this.L.f141716e);
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) this.f197770d.getSystemService("layout_inflater");
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.tencent.mm.R.id.cgi);
        viewGroup2.removeAllViews();
        layoutInflater.inflate(com.tencent.mm.R.layout.bhh, viewGroup2);
        return u17;
    }

    public GameRegionPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.G = com.tencent.mm.R.layout.byv;
    }
}
