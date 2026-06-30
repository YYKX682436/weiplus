package com.tencent.tmassistantsdk.openSDK.opensdktomsdk.component;

/* loaded from: classes13.dex */
public class PopDialog extends com.tencent.mm.ui.widget.dialog.k2 {
    public static final int DIALOG_STYLE_MUL_BTN = 2;
    public static final int DIALOG_STYLE_SINGLE_BTN = 1;
    protected static final java.lang.String TAG = "PopDialog";
    protected android.widget.RelativeLayout contentLayout;
    protected android.widget.TextView contentView;
    public android.widget.ProgressBar downloadProgressBar;
    public android.widget.TextView downloadText;
    protected android.content.Context mContext;
    private android.widget.Button negativeBtn;
    protected android.widget.Button positiveBtn;
    protected android.widget.FrameLayout positiveLayout;
    public com.tencent.tmassistantsdk.util.Res rTool;
    protected int style;
    protected android.widget.TextView titleView;

    public PopDialog(android.content.Context context) {
        super(context);
        this.style = 0;
        this.titleView = null;
        this.contentLayout = null;
        this.contentView = null;
        this.positiveBtn = null;
        this.positiveLayout = null;
        this.downloadProgressBar = null;
        this.downloadText = null;
        this.rTool = null;
        this.negativeBtn = null;
        this.mContext = context;
    }

    private void initHeaderView() {
        this.titleView.setPadding(px(30), 0, px(30), 0);
        this.contentLayout.setPadding(px(30), 0, px(30), px(30));
        this.contentView.setPadding(0, px(30), 0, px(30));
    }

    private void initMulDialog() {
        this.negativeBtn.setHeight(px(78));
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) this.negativeBtn.getLayoutParams();
        marginLayoutParams.setMargins(0, 0, px(30), 0);
        this.negativeBtn.setLayoutParams(marginLayoutParams);
        this.positiveBtn.setHeight(px(78));
        this.positiveBtn.setTextSize(px(30));
        this.downloadProgressBar.setMinimumHeight(px(78));
        this.downloadText.setHeight(px(78));
    }

    private void initSingleDialog() {
        this.positiveLayout.setVisibility(8);
        this.negativeBtn.setHeight(px(78));
        this.negativeBtn.setText(this.mContext.getString(this.rTool.string("white_list_submit")));
    }

    private int px(int i17) {
        int screenHeight = getScreenHeight();
        int screenWidth = getScreenWidth();
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, " width = " + screenWidth + "  height = " + screenHeight);
        if (screenHeight <= screenWidth) {
            screenHeight = screenWidth;
        }
        int i18 = (int) ((i17 * (screenHeight + 0.0f)) / 1280.0f);
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "rtn" + i17 + ":" + i18);
        return i18;
    }

    private void relayoutView() {
        initHeaderView();
        int i17 = this.style;
        if (i17 == 1) {
            initSingleDialog();
        } else {
            if (i17 != 2) {
                return;
            }
            initMulDialog();
        }
    }

    public int getScreenHeight() {
        android.content.Context context = this.mContext;
        if (context != null) {
            return context.getResources().getDisplayMetrics().heightPixels;
        }
        return 0;
    }

    public int getScreenWidth() {
        android.content.Context context = this.mContext;
        if (context != null) {
            return context.getResources().getDisplayMetrics().widthPixels;
        }
        return 0;
    }

    @Override // android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.tmassistantsdk.util.Res res = new com.tencent.tmassistantsdk.util.Res(this.mContext);
        this.rTool = res;
        super.setContentView(res.layout("com_tencent_tmassistant_sdk_white_list_dlg"));
        super.getWindow().setLayout(px(662), px(662));
        setCancelable(false);
        this.titleView = (android.widget.TextView) findViewById(this.rTool.id("dlg_title_tv"));
        this.contentLayout = (android.widget.RelativeLayout) findViewById(this.rTool.id("content"));
        this.contentView = (android.widget.TextView) findViewById(this.rTool.id("dlg_body_tv"));
        this.positiveBtn = (android.widget.Button) findViewById(this.rTool.id("positive_btn"));
        this.positiveLayout = (android.widget.FrameLayout) findViewById(this.rTool.id("positive_btn_frame_layout"));
        this.downloadProgressBar = (android.widget.ProgressBar) findViewById(this.rTool.id("download_pb"));
        this.downloadText = (android.widget.TextView) findViewById(this.rTool.id("progress_txt_tv"));
        this.negativeBtn = (android.widget.Button) findViewById(this.rTool.id("negtive_btn"));
        relayoutView();
    }

    public void setContent(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        this.contentView.setText(str);
    }

    public void setNegativeBtnClickListener(android.view.View.OnClickListener onClickListener) {
        if (onClickListener != null) {
            this.negativeBtn.setOnClickListener(onClickListener);
        }
    }

    public void setNegativeBtnText(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        this.negativeBtn.setText(str);
    }

    public void setPositiveBtnBgResource(int i17) {
        if (i17 != 0) {
            this.positiveBtn.setBackgroundResource(i17);
        }
    }

    public void setPositiveBtnClickListener(android.view.View.OnClickListener onClickListener) {
        if (onClickListener != null) {
            this.positiveBtn.setOnClickListener(onClickListener);
        }
    }

    public void setPositiveBtnEnable(boolean z17) {
        android.widget.Button button = this.positiveBtn;
        if (button != null) {
            button.setEnabled(z17);
        }
    }

    public void setPositiveBtnTag(com.tencent.tmassistantsdk.openSDK.opensdktomsdk.data.ActionButton actionButton) {
        if (actionButton != null) {
            this.positiveBtn.setTag(actionButton);
        }
    }

    public void setPositiveBtnText(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        this.downloadText.setText(str);
    }

    public void setTitle(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        this.titleView.setText(str);
    }

    public PopDialog(android.content.Context context, int i17) {
        super(context, i17);
        this.style = 0;
        this.titleView = null;
        this.contentLayout = null;
        this.contentView = null;
        this.positiveBtn = null;
        this.positiveLayout = null;
        this.downloadProgressBar = null;
        this.downloadText = null;
        this.rTool = null;
        this.negativeBtn = null;
        this.mContext = context;
    }

    public PopDialog(android.content.Context context, int i17, int i18) {
        super(context, i17);
        this.titleView = null;
        this.contentLayout = null;
        this.contentView = null;
        this.positiveBtn = null;
        this.positiveLayout = null;
        this.downloadProgressBar = null;
        this.downloadText = null;
        this.rTool = null;
        this.negativeBtn = null;
        this.mContext = context;
        this.style = i18;
    }
}
