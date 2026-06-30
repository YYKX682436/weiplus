package com.tencent.mm.plugin.game.api;

/* loaded from: classes5.dex */
public class GameInputConfig implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.game.api.GameInputConfig> CREATOR = new m33.t0();
    public java.lang.String atContentId;
    public java.lang.String atContext;
    public int atLimit;
    public boolean canSendWithoutText;
    public boolean canShowAtSomeoneView;
    public java.lang.String contentText;
    public java.lang.String emoticonBoardViewType;
    public boolean forceClearContent;
    public int forceUserInterfaceStyle;
    public boolean hideImgBtn;
    public java.lang.String identifier;
    public boolean isToolsProcess;
    public int maxInputCharsCo;
    public int maxInputCharsCount;
    public java.lang.String quickEmojiList;
    public java.lang.String returnKeyType;
    public boolean showEmojiQuickInputView;
    public boolean stickBtmIfNonEmpty;
    public java.lang.String textPlaceHolder;

    public GameInputConfig() {
        this.stickBtmIfNonEmpty = false;
        this.forceClearContent = false;
        this.maxInputCharsCo = 1000;
        this.canSendWithoutText = false;
        this.isToolsProcess = true;
        this.canShowAtSomeoneView = false;
        this.maxInputCharsCount = 1000;
        this.returnKeyType = "send";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.textPlaceHolder);
        parcel.writeString(this.emoticonBoardViewType);
        parcel.writeString(this.contentText);
        parcel.writeInt(this.stickBtmIfNonEmpty ? 1 : 0);
        parcel.writeInt(this.forceClearContent ? 1 : 0);
        parcel.writeInt(this.maxInputCharsCo);
        parcel.writeInt(this.canSendWithoutText ? 1 : 0);
        parcel.writeString(this.identifier);
        parcel.writeInt(this.isToolsProcess ? 1 : 0);
        parcel.writeInt(this.hideImgBtn ? 1 : 0);
        parcel.writeInt(this.forceUserInterfaceStyle);
        parcel.writeInt(this.showEmojiQuickInputView ? 1 : 0);
        parcel.writeString(this.quickEmojiList);
        parcel.writeInt(this.maxInputCharsCount);
        parcel.writeString(this.returnKeyType);
        parcel.writeInt(this.canShowAtSomeoneView ? 1 : 0);
        parcel.writeString(this.atContentId);
        parcel.writeString(this.atContext);
        parcel.writeInt(this.atLimit);
    }

    public GameInputConfig(android.os.Parcel parcel) {
        this.stickBtmIfNonEmpty = false;
        this.forceClearContent = false;
        this.maxInputCharsCo = 1000;
        this.canSendWithoutText = false;
        this.isToolsProcess = true;
        this.canShowAtSomeoneView = false;
        this.maxInputCharsCount = 1000;
        this.returnKeyType = "send";
        this.textPlaceHolder = parcel.readString();
        this.emoticonBoardViewType = parcel.readString();
        this.contentText = parcel.readString();
        this.stickBtmIfNonEmpty = parcel.readInt() == 1;
        this.forceClearContent = parcel.readInt() == 1;
        this.maxInputCharsCo = parcel.readInt();
        this.canSendWithoutText = parcel.readInt() == 1;
        this.identifier = parcel.readString();
        this.isToolsProcess = parcel.readInt() == 1;
        this.hideImgBtn = parcel.readInt() == 1;
        this.forceUserInterfaceStyle = parcel.readInt();
        this.showEmojiQuickInputView = parcel.readInt() == 1;
        this.quickEmojiList = parcel.readString();
        this.maxInputCharsCount = parcel.readInt();
        this.returnKeyType = parcel.readString();
        this.canShowAtSomeoneView = parcel.readInt() == 1;
        this.atContentId = parcel.readString();
        this.atContext = parcel.readString();
        this.atLimit = parcel.readInt();
    }
}
