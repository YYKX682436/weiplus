package com.tencent.mm.plugin.subapp.ui.openapi;

/* loaded from: classes8.dex */
public class ServicePreference extends com.tencent.mm.ui.base.preference.Preference {
    public final android.content.Context L;
    public fg4.l M;
    public java.util.List N;
    public android.widget.AdapterView.OnItemClickListener P;
    public final int Q;
    public final boolean R;
    public final int S;

    public ServicePreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        com.tencent.mm.ui.base.MMGridView mMGridView = (com.tencent.mm.ui.base.MMGridView) view.findViewById(com.tencent.mm.R.id.gts);
        if (mMGridView == null) {
            return;
        }
        this.M = new fg4.l(this.L, this.N);
        com.tencent.mm.pluginsdk.model.app.u5.Di().remove(this.M);
        com.tencent.mm.pluginsdk.model.app.u5.Di().add(this.M);
        mMGridView.setAdapter((android.widget.ListAdapter) this.M);
        mMGridView.setOnItemClickListener(new fg4.q(this));
        if (this.R) {
            mMGridView.setOnItemLongClickListener(new fg4.r(this));
        }
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f484228dg2);
        if (this.M.getCount() == 0) {
            textView.setVisibility(0);
            textView.setText(this.S);
            mMGridView.setVisibility(8);
        } else {
            textView.setVisibility(8);
            mMGridView.setVisibility(0);
        }
        android.widget.Button button = (android.widget.Button) view.findViewById(com.tencent.mm.R.id.azj);
        button.setVisibility(this.Q);
        button.setOnClickListener(null);
    }

    public ServicePreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.P = null;
        this.R = false;
        this.S = 0;
        this.L = context;
        this.G = com.tencent.mm.R.layout.f488130hz;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rj.t.f396152b);
        this.Q = obtainStyledAttributes.getInt(0, 8);
        this.R = obtainStyledAttributes.getBoolean(1, false);
        this.S = obtainStyledAttributes.getResourceId(2, 0);
        obtainStyledAttributes.recycle();
    }
}
